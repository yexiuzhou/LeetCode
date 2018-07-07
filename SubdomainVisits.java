class SubdomainVisits{
   public List<String> subdomainVisits(String[] cpdomains) {
      Map<String, Integer> counts = new HashMap();
      for (String domain: cpdomains) {
         String[] info = domain.split("\\s+");
         String[] fragment = info[1].split("\\.");
         int count = Integer.valueOf(info[0]);
         String cur = "";
         for (int i = fragment.length - 1; i >= 0; i--) {
            if (i < fragment.length - 1) {
               cur = fragment[i] + "." + cur;
            } else {
               cur = fragment[i] + "" + cur;
            }
            counts.put(cur, counts.getOrDefault(cur, 0) + count);
         }
      }
      
      List<String> answer = new ArrayList();
      for (String domain: counts.keySet())
         answer.add("" + counts.get(domain) + " " + domain);
      return answer;
   }
}