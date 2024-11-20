import java.util.Scanner;

public class PrecipitationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] monthlyPrecipitation = new double[12]; // 存储每个月的降水量
        double totalPrecipitation = 0; // 总降水量

        // 输入每个月的降水量
        System.out.println("请输入每个月的降水量（单位：毫米）：");
        for (int i = 0; i < 12; i++) {
            System.out.print("第 " + (i + 1) + " 个月的降水量: ");
            monthlyPrecipitation[i] = scanner.nextDouble();
            totalPrecipitation += monthlyPrecipitation[i]; // 累加总降水量
        }

        // 计算年平均降水量
        double annualAverage = totalPrecipitation / 12;

        // 输出结果
        System.out.println("\n年总降水量: " + totalPrecipitation + " 毫米");
        System.out.println("年平均降水量: " + annualAverage + " 毫米");
        System.out.println("每个月的降水量与平均降水量的偏差：");

        for (int i = 0; i < 12; i++) {
            double deviation = monthlyPrecipitation[i] - annualAverage; // 计算偏差
            System.out.printf("第 %d 个月的降水量: %.2f 毫米，偏差: %.2f 毫米\n", (i + 1), monthlyPrecipitation[i], deviation);
        }

        scanner.close(); // 关闭扫描器
    }
}
