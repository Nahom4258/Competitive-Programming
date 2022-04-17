class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] distance = new int[points.length][2];
        int[][] returnValues = new int[k][2];
        
        for(int i = 0; i<points.length; i++){       //store distance with index in an array
            distance[i][0] = i;
            distance[i][1] = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
        }
        
        Arrays.sort(distance, new Comparator<int[]>() {     //sort the array with distance value
            public int compare(int[] a, int[] b){
                return Integer.compare(a[1], b[1]);
            }
        });
        
        for(int i = 0; i<k; i++){       //store the first 'k' values into returnValues array
            returnValues[i][0] = points[distance[i][0]][0];
            returnValues[i][1] = points[distance[i][0]][1];
        }
        
        return returnValues;
    }
}
