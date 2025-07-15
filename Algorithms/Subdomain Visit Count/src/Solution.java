import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();

        for (String cpdomain : cpdomains) {
            int space = cpdomain.indexOf(' ');
            int num = Integer.parseInt(cpdomain.substring(0, space));
            String domain = cpdomain.substring(space + 1);
            count.merge(domain, num, Integer::sum);
            for (int i = 0; i < domain.length(); i++)
                if (domain.charAt(i) == '.') {
                    String subdomain = domain.substring(i + 1);
                    count.merge(subdomain, num, Integer::sum);
                }
        }

        for (final String subdomain : count.keySet())
            ans.add(new StringBuilder().append(count.get(subdomain)).append(' ').append(subdomain).toString());

        return ans;
    }
}