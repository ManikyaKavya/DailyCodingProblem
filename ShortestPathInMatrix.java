import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPathInMatrix {
    static int ROW = 9; 
static int COL = 10; 
  
static class Point 
{ 
    int x; 
    int y; 
  
    public Point(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
}; 
static class queueNode 
{ 
    Point pt; 
    int dist;  
  
    public queueNode(Point pt, int dist) 
    { 
        this.pt = pt; 
        this.dist = dist; 
    } 
}; 
static boolean isValid(int row, int col) 
{ 
    return (row >= 0) && (row < ROW) && 
           (col >= 0) && (col < COL); 
} 
static int rowNum[] = {-1, 0, 0, 1}; 
static int colNum[] = {0, -1, 1, 0}; 
  
static int BFS(int mat[][], Point src, 
                            Point dest) 
{ 
    if (mat[src.x][src.y] != 1 ||  
        mat[dest.x][dest.y] != 1) 
        return -1; 
  
    boolean [][]visited = new boolean[ROW][COL]; 
      
    visited[src.x][src.y] = true; 
  
    Queue<queueNode> q = new LinkedList<>(); 
      
    queueNode s = new queueNode(src, 0); 
    q.add(s); 
  
    while (!q.isEmpty()) 
    { 
        queueNode curr = q.peek(); 
        Point pt = curr.pt; 
  
        if (pt.x == dest.x && pt.y == dest.y) 
            return curr.dist; 
  
        q.remove(); 
  
        for (int i = 0; i < 4; i++) 
        { 
            int row = pt.x + rowNum[i]; 
            int col = pt.y + colNum[i]; 
              
            if (isValid(row, col) &&  
                    mat[row][col] == 1 &&  
                    !visited[row][col]) 
            { 
                visited[row][col] = true; 
                queueNode Adjcell = new queueNode(new Point(row, col), 
                                                      curr.dist + 1 ); 
                q.add(Adjcell); 
            } 
        } 
    } 
  
    return -1; 
} 
  
public static void main(String[] args)  
{ 
    int mat[][]=new int[100][100];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. rows:");
    int rows=sc.nextInt();sc.nextLine();
    System.out.println("enter no. cols:");
    int col=sc.nextInt();sc.nextLine();
    System.out.println("enter no.:");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<col;j++)
        {
            mat[i][j]=sc.nextInt();sc.nextLine();
        }
    }
    System.out.println("enter source");
    int a=sc.nextInt();sc.nextLine();
    int b=sc.nextInt();sc.nextLine();
    System.out.println("enter dest");
    int c=sc.nextInt();sc.nextLine();
    int d=sc.nextInt();sc.nextLine();
    sc.close();

    Point source = new Point(a,b); 
    Point dest = new Point(c,d); 
  
    int dist = BFS(mat, source, dest); 
  
    if (dist != Integer.MAX_VALUE) 
        System.out.println("Shortest Path is " + dist); 
    else
        System.out.println("Shortest Path doesn't exist"); 
    } 
}
