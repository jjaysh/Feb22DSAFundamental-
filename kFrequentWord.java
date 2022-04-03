package WEEK4.WEEK5;

import java.util.*;

class kfrequentwords {
    public List<String> topKFrequentAlternate(final String[] words, int k) {
        final Map<String, Integer> freq = new HashMap<Integer>();

        final Queue<WordFreq> queue = new PriorityQueue<>((w1, w2) -> {
            if (w1.getFreq() != w2.getFreq()) {
                return w1.getFreq() - w2.getFreq();
            }
            return w2.getWord().compareTo(w1.getWord());
        });

        final List<String> result = new ArrayList<>();

        for (final String word : words) {
            if (freq.containsKey(word)) {
                final int count = freq.get(word);
                freq.put(word, count + 1);
            } else {
                freq.put(word, 1);
            }
        }

        for (final Map.Entry<String, Integer> entry : freq.entrySet()) {
            queue.offer(new WordFreq(entry.getKey(), entry.getValue()));

            if (queue.size() > k) {
                queue.poll();
            }
        }

        while (k-- > 0) {
            result.add(queue.poll().getWord());
        }

        Collections.reverse(result);
        return result;
    }
}

class WordFreq {
    private final String word;
    private final int freq;

    WordFreq(final String word, final int freq) {
        this.word = word;
        this.freq = freq;
    }

    String getWord() {
        return this.word;
    }

    int getFreq() {
        return this.freq;
    }

    @Override
    public String toString() {
        return Objects.toString(word) + "->" + Objects.toString(freq);
    }

    public static void main(String[] args) {
        kfrequentwords t = new kfrequentwords();
        String[] words = { "amita", "sakshi", "pandu", "nanu" };
        int k = 2;
        List<String> res = new ArrayList<String>();
        res = t.topKFrequentAlternate(words, k);
        ListIterator<String> lItr = res.listIterator();
        while (lItr.hasNext()) {
            System.out.println(lItr.next());
        }
    }
}