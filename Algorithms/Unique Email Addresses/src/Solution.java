import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) uniqueEmails.add(convertEmail(email));

        return uniqueEmails.size();
    }

    private String convertEmail(String email) {

        StringBuilder builder = new StringBuilder();
        boolean isLocalName = true, isDomainName = false;
        for (char c : email.toCharArray()) {

            if (c == '+') isLocalName = false;
            if (c == '@') isDomainName = true;
            if ((isLocalName && !isDomainName && c == '.')
                    || (!isLocalName && !isDomainName)) continue;

            builder.append(c);
        }

        return builder.toString();
    }
}