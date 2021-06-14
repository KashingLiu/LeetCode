package com.company.Kashingliu;

import java.util.*;

public class Q721_0422 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < accounts.size(); ++i) {
            map.put(i, accounts.get(i).get(0));
        }
        HashMap<String, Integer> uf = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < accounts.size(); ++i) {
            for (int j = 1; j < accounts.get(i).size(); ++j) {
                if (!uf.containsKey(accounts.get(i).get(j))) {
                    uf.put(accounts.get(i).get(j), cnt);
                }
            }
            cnt++;
        }
        for (int i = 0; i < accounts.size(); ++i) {
            if (accounts.get(i).size() <= 2) {
                continue;
            }
            for (int j = 1; j < accounts.get(i).size() - 1; ++j) {
                uf.put(accounts.get(i).get(j + 1), uf.get(accounts.get(i).get(j)));
            }
        }
        List<List<String>> result = new LinkedList<>();
        HashMap<Integer, List<String>> temp = new HashMap<>();
        for (String i: uf.keySet()) {
            String email = i;
            int id = uf.get(email);
            List<String> account = temp.getOrDefault(id, new ArrayList<String>());
            account.add(email);
            temp.put(id, account);
        }
        for (int i : temp.keySet()) {
            List<String> init = new LinkedList<>();
            Collections.sort(temp.get(i));
            init.add(map.get(i));
            init.addAll(temp.get(i));
            result.add(init);
        }
        return result;
    }
}
