
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public Integer lastStoneWeight(int[] batu) {
        PriorityQueue<Integer> maxBatu = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : batu) maxBatu.offer(i);

        while (maxBatu.size()>1) {
            int batuBesar1 = maxBatu.poll();
            int batuBesar2 = maxBatu.poll();
            maxBatu.offer(Math.abs(batuBesar1-batuBesar2));
            System.out.printf("""
                    Batu terbesar saat ini adalah %d dan %d
                    
                    hasil dari %d - %d adalah %d
                    ==========================================
                    """, batuBesar1, batuBesar2, batuBesar1, batuBesar2, batuBesar1-batuBesar2);
        }
        System.out.printf("Batu terakhir memiliki berat sebesar %d",maxBatu.poll());
        return 0;
    }
}
