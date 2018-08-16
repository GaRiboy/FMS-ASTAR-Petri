//这个类负责观察每个时刻的状态
public class State {
    private State parent;       //定义当前状态的上一个状态
    private int[] currentValue; //当前状态每个位置的内容
    private int G;              //G：是个准确的值，是起点到当前结点的代价
    private int H;              //H：是个估值，当前结点到目的结点的估计代价

    public State getParent() {
        return parent;
    }
    public void setParent(State parent) {
        this.parent = parent;
    }
    public int[] getCurrentValue() {
        return currentValue;
    }
    public void setCurrentValue(int[] currentValue) {
        this.currentValue = currentValue;
    }
    public int getG() {
        return G;
    }
    public void setG(int g) {
        G = g;
    }
    public int getH() {
        return H;
    }
    public void setH(int h) {
        H = h;
    }

    public State(int[] value){
        this.currentValue = value;
    }

}
