public class Main {
    public static void main(String[] args) {
        StringUtils cases = new StringUtils();

        System.out.println(cases.toCamelCase("dit moet camel case zijn"));
        System.out.println(cases.toPascalCase("dit moet pascal case zijn"));
        System.out.println(cases.toSnakeCase("dit moet snake case zijn"));
        System.out.println(cases.toUpperSnakeCase("dit moet upper snake case zijn"));
        System.out.println(cases.toKebabCase("dit moet kebab case zijn"));
    }
}