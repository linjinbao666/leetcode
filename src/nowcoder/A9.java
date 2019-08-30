package nowcoder;

/**
 * 变态跳台阶
 */
public class A9 {
    public int JumpFloorII(int target) {
        if (target==1) return 1;
        return 2*JumpFloorII(target-1);
    }
}
