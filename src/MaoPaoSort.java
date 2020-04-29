import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:PACKAGE_NAME</p>
 * <p>ClassName:MaoPaoSort</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020/2/26
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        int[] data = {1, 2, 6, 5, 3};
        for (int i = data.length-1 ; i > 0 ; i--) {/*控制循环的次数*/
            for (int j = 0; j < i; j++) {/*控制比较的次数*/
                if (data[j]>data[j+1]){/*比较大小*/
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;/*交换顺序*/
                }
            }
        }
        System.out.println(Arrays.toString(data));
        
    }
}
