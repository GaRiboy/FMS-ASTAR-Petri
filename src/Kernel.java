import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kernel {
    Queue<State> openList = new PriorityQueue<State>(); // 创建open表 优先队列(升序)
    List<State> closeList = new ArrayList<State>();  //创建close表
    private State start;
    private State end;
    private int[][] L1;
    private int[][] L2;

    public Kernel(State start,State end,int[][] l1, int[][] l2){
        this.start = start;
        this.end = end;
        this.L1 = l1;
        this.L2 = l2;
    }

    //核心流程
    public void start() {
//        openList.clear();
//        closeList.clear();
//        openList.add(mapInfo.start);//输入起始状态
//        while (!openList.isEmpty())
//        {
////            if (isCoordInClose(mapInfo.end.stateM))//如果是目标状态
////            {
////                drawPath(mapInfo.maps, mapInfo.end);//画图
////                break;
////            }
//            Node current = openList.poll();         //令OPEN表中第一个STATE 当作当前状态
//            closeList.add(current);                 //把当前状态添加CLOSE表中
//            addNeighborNodeInOpen(mapInfo,current); //把当前状态收到各个变迁刺激后的下一个状态添加到OPEN表中
//        }
        openList.clear();
        closeList.clear();
        openList.add(start);

    }
}
