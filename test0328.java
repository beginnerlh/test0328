/*
 * ��Ŀ����
��һƬ1000*1000�Ĳݵأ�С�׳�ʼվ��(1,1)(�����Ͻǵ�λ��)��С����ÿһ��������������ƶ������ڵĲݵ��ϳԲ�(С�ײ����߳��߽�)�����ɳ�����ȥ��׽�ɰ���С�ף���������n�����塣��i�����屻�����ں�����Ϊxi ��������Ϊyi ��λ���ϣ�С��һ������һ�����壬���ᱻ������׽����Ϊ��ȥ���С�ף���Ҫ֪��С�����ٶ�������ܻ�����һ�����壬�Ӷ���ǰ���С�ס�
��������:
��һ��Ϊһ������n(n �� 1000)����ʾ����һ��ӵ��n�����塣
�ڶ�����n������xi����ʾ��i������ĺ�����
��������n������yi����ʾ��i�������������
��֤���궼�ڲݵط�Χ�ڡ�

�������:
���һ������,��ʾС�����ٿ��ܶ���������볬��������

ʾ��1
����
3
4 6 8
1 2 1

���
3
*/
package lianxi0328;

import java.util.Scanner;
public class test0328{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 2000;
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = in.nextInt();
        }
        for(int i = 0;i<n; i++){
            y[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(x[i] + y[i] - 2 < count){
                count = x[i] + y[i] - 2;
            }
        }
        System.out.println(count);
    }
}
