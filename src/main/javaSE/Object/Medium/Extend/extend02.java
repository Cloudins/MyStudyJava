package Object.Medium.Extend;

public class extend02 {
    public static void main(String[] args) {
        /**
         * 编写Test 类，在main 方法中创建PC 和NotePad 对象，分别给对象中特有的属性赋值，以及从Computer 类继承的
         * 属性赋值，并使用方法并打印输出信息
         */
        NotePad notePad = new NotePad("a", "b", "d", "red");
        notePad.getDetails();
    }
}
class Computer{
    private String CPU;
    private String memory;
    private String Hard_disk;

    public Computer(String CPU, String memory, String hard_disk) {
        this.CPU = CPU;
        this.memory = memory;
        Hard_disk = hard_disk;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHard_disk(String hard_disk) {
        Hard_disk = hard_disk;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMemory() {
        return memory;
    }

    public String getHard_disk() {
        return Hard_disk;
    }
    public void getDetails(){
        /**
         *编写Computer 类，包含CPU、内存、硬盘等属性，getDetails 方法用于返回Computer 的详细信息
         */
        System.out.println("电脑的属性： CPU：" + CPU + " 内存：" + memory + " 硬盘: " + Hard_disk);
    }
}

class PC extends Computer{
    public PC(String CPU, String memory, String hard_disk, String brand) {
        super(CPU, memory, hard_disk);
        this.brand = brand;
    }

    /**
     * 编写PC 子类，继承Computer 类，添加特有属性【品牌brand】
     */

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class NotePad  extends Computer{
    /**
     * 编写NotePad 子类，继承Computer 类，添加特有属性【color】
     */
    private String color;

    public NotePad(String CPU, String memory, String hard_disk, String color) {
        super(CPU, memory, hard_disk);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

