 public class DiagonalPrint {
 // The idea is to diagonally print diagonally the elements from right corner to left corner.
 // For even diagonal traverse, we'll reverse the elements
    public static int[] findDiagonalOrder(int[][] matrix) {
         int[] NO_FILES = {};
        if(matrix.length == 0)
            return NO_FILES;
        int row = matrix.length;
        int col = matrix[0].length;
        
        int r=0,c=0,k=0;
        ArrayList<Integer> al =  new ArrayList<Integer>();
        int resArr[]= new int[row*col];
        for(int i=0;i<row+col-1;i++){
            al.clear();
            r = i<col?0:i-col+1;
            c = i<col?i:col-1;
            if(i%2 ==0){
                while(r < row && c>-1){
                    al.add(matrix[r][c]);
                    r++;
                    c--;
                }
                Collections.reverse(al);
                for(int ele: al)
                resArr[k++] = ele;    
            }else{
                while(r < row && c >-1){
                    resArr[k++] = matrix[r][c]; 
                    r++;
                    c--;
                }
            }
           
            
        }
         for(int i=0;i< resArr.length;i++){
                System.out.println(resArr[i]);
            }
        return resArr;
    }
 }
