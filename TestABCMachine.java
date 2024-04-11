public class TestABCMachine {

  public static void main(String[] args) throws Exception {
    System.out.println("HelloWorld");
    compiler.StateMachine abcMachine = new compiler.machines.ABCMachine();
    java.io.OutputStreamWriter outWriter = new java.io.OutputStreamWriter(System.out);
    abcMachine.process("AABBBBC", outWriter);
    System.out.print(abcMachine.asDot());
  }
}
