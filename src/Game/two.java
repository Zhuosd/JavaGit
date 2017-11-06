package Game;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-11-06 14:48
 */
public class two {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int count = 0;
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    for (int k = 1; k < 10; k++) {
                        for (int l = 1; l < 10; l++) {
                            for (int m = 1; m < 10; m++) {
                                for (int n = 1; n < 10; n++) {
                                    for (int o = 1; o < 10; o++) {
                                        for (int p = 1; p < 10; p++) {
                                            for (int q = 1; q < 10; q++) {
                                                if ((i + j + k + l) == (l + m + n + o) && (i + j + k + l) == (o + q + p + i)
                                                        && i != j && i != k && i != l && i != m && i != n && i != o
                                                        && i != p && i != q && j != k && j != l && j != m && j != n
                                                        && j != o && j != p && j != q && k != l && k != m && k != n
                                                        && k != o && k != p && k != q && l != m && l != n && l != o
                                                        && l != p && l != q && m != n && m != o && m != p && m != q
                                                        && n != o && n != p && n != q && o != p && o != q && p != q) {
                                                    count++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count / 6);// 旋转是三种相同的，镜像也是三种相同的。所以除以6
        }
}