import java.util.*;
public class O1MATRIX {
    public static void main(String[] args) {
        int ans[][]=updateMatrix(new int [][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}});
        for(int [] a:ans)
        {
            System.out.println(Arrays.toString(a));
        }
    }
       public static  int [][] dir={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        public static  int[][] updateMatrix(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;

            int result[][]=new int[m][n];
            Queue<int []> q=new LinkedList<>();
            for(int i=0 ; i<m ;i++)
            {
                for(int j=0 ; j<n;j++)
                {
                    if(mat[i][j]==0)
                    {
                        result[i][j]=0;
                        q.offer(new int[]{i,j});
                    }
                    else{
                        result[i][j]=-1;
                    }
                }
            }
            while(!q.isEmpty())
            {
                int cur[]=q.poll();
                int i=cur[0];
                int j=cur[1];

                for(int [] d: dir)
                {
                    int new_i=i+d[0];
                    int new_j=j+d[1];
                    if(new_i>=0 && new_j>=0 && new_i<m && new_j< n && result[new_i][new_j]==-1)
                    {
                        result[new_i][new_j]=result[i][j]+1;

                        q.offer(new int[]{new_i,new_j});
                    }

                }
            }
            return result;
        }
    }


