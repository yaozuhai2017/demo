/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:PACKAGE_NAME</p>
 * <p>ClassName:Test</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020/2/25
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */

public class DiGuiSort {
    public static void main(String[] args) {
        System.out.println(DiGui(5));
    }
    public static int DiGui(int i ){
        if(i == 1){
            return 1;
        }else{
            return i*DiGui(i-1);
        }
    }
}
