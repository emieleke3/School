public class StringUtils {

    public StringUtils() {

    }

    public String toCamelCase(String sentence) {
        String[] parts = sentence.split("[^a-zA-Z0-9]+");
        String camelCaseString = "";

        for (String part : parts ) {
            if(camelCaseString.length() == 0) {
                camelCaseString = part.toLowerCase();
            } else {
                camelCaseString += part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            }

        }

        return camelCaseString;
    }
    public String toPascalCase(String sentence) {
        String[] parts = sentence.split("[^a-zA-Z0-9]+");
        String pascalCaseString = "";
        for (String part : parts ) {
            if(part.length() > 0){
                pascalCaseString += part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            }
        }

        return pascalCaseString;
    }
    public String toSnakeCase(String sentence) {
        String[] parts = sentence.split("[^a-zA-Z0-9]+");
        String snakeCaseString = "";

        for (int i = 0; i < parts.length; i++)
        {
            if (i > 0)
            {
                snakeCaseString += "_";
            }
            snakeCaseString += parts[i].toLowerCase();
        }

        return snakeCaseString;
    }
    public String toUpperSnakeCase(String sentence) {
        String[] parts = sentence.split("[^a-zA-Z0-9]+");
        String upperSnakeCaseString = "";

        for (int i = 0; i < parts.length; i++)
        {
            if (i > 0)
            {
                upperSnakeCaseString += "_";
            }
            upperSnakeCaseString += parts[i].toUpperCase();
        }

        return upperSnakeCaseString;
    }
    public String toKebabCase(String sentence) {
        String[] parts = sentence.split("[^a-zA-Z0-9]+");
        String upperKebabCase = "";

        for (int i = 0; i < parts.length; i++)
        {
            if (i > 0)
            {
                upperKebabCase += "-";
            }
            upperKebabCase += parts[i].toLowerCase();
        }

        return upperKebabCase;
    }
    public String toL33t(String sentence) {
        return "" ;
    }
}
