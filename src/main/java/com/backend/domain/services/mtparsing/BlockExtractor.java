package com.backend.domain.services.mtparsing;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class BlockExtractor {

    private static final String BLOCK_PATTERN_STRING = "\\{([124]):([\\s\\S]*?)\\}";
    private static final String EXPRESSION_PATTERN_STRING = "\\{([0-9]{3}):([\\s\\S]*?)\\}";

    public static String[] extractBlocks(String content) {
        Pattern blockPattern = Pattern.compile(BLOCK_PATTERN_STRING, Pattern.DOTALL);
        Pattern expressionPattern = Pattern.compile(EXPRESSION_PATTERN_STRING, Pattern.DOTALL);

        Matcher blockMatcher = blockPattern.matcher(content);
        Matcher expressionMatcher = expressionPattern.matcher(content);

        String[] blocks = new String[5];
        Map<String, String> block4Map = new HashMap<>();

        while (blockMatcher.find()) {
            int blockNumber = Integer.parseInt(blockMatcher.group(1));
            String blockContent = blockMatcher.group(2).trim();

            if (blockNumber >= 1 && blockNumber <= 4) {
                blocks[blockNumber - 1] = blockContent;

                if (blockNumber == 4) {
                    block4Map = splitBlock4(blockContent);
                }
            }
        }

        StringBuilder block3Content = new StringBuilder();
        while (expressionMatcher.find()) {
            String fullExpression = expressionMatcher.group(0);
            block3Content.append(fullExpression).append("\n");
        }
        blocks[2] = block3Content.toString().trim();

        return blocks;
    }

    public static Map<String, String> splitBlock4(String content) {
        Map<String, String> map = new HashMap<>();
        Pattern pattern = Pattern.compile(":(\\w+):(.*?)(?=(?:\\n:\\w+:|$))", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            String key = matcher.group(1).trim();
            String value = matcher.group(2).trim();
            map.put(key, value);
        }

        return map;
    }
}
