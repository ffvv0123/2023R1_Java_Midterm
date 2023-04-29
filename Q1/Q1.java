import java.io.*;
/**
 * Q1: This program break the binary secured file
 * 
 * @author Suhyeon Jo
 * @since 2023-04-28
 * @version v0.2
 *
 */

public class Q1 {

	public static void main(String[] args) throws IOException {

		/**
		 * Import Q1.data file. This file is cipher file
		 */
	File inFile = new File("/Users/jjos/Desktop/Java/2023_Midterm_OOP/Q1.data");
        FileInputStream inStream1 = new FileInputStream(inFile);
        DataInputStream inDataStream1 = new DataInputStream(inStream1);

        /**
         * Import A1_CodeBook.data file. This file is decoding key file
         */
        File codeBook = new File("/Users/jjos/Desktop/Java/2023_Midterm_OOP/Q1_CodeBook.data");
        FileReader fileReader = new FileReader(codeBook);
        BufferedReader inDataStream2 = new BufferedReader(fileReader);
        
        
        /**
         * Import Output result file. Each data type value will be stored in here
         */
        File Q1_Int = new File("/Users/jjos/Desktop/Java/23-1MidTermExam/src/Q1_Int.txt");
        File Q1_Boolean = new File("/Users/jjos/Desktop/Java/23-1MidTermExam/src/Q1_Boolean.txt");
        File Q1_Double = new File("/Users/jjos/Desktop/Java/23-1MidTermExam/src/Q1_Double.txt");
        File Q1_Char = new File("/Users/jjos/Desktop/Java/23-1MidTermExam/src/Q1_Char.txt");
        File Q1_Long = new File("/Users/jjos/Desktop/Java/23-1MidTermExam/src/Q1_Long.txt");
        
        FileOutputStream outQ1_IntStream = new FileOutputStream(Q1_Int);
        FileOutputStream outQ1_BooleanStream = new FileOutputStream(Q1_Boolean);
        FileOutputStream outQ1_DoubleStream = new FileOutputStream(Q1_Double);
        FileOutputStream outQ1_CharStream = new FileOutputStream(Q1_Char);
        FileOutputStream outQ1_LongStream = new FileOutputStream(Q1_Long);
        
        
		PrintWriter outIntStream = new PrintWriter(outQ1_IntStream);
		PrintWriter outBooleanStream = new PrintWriter(outQ1_BooleanStream);
		PrintWriter outDoubleStream = new PrintWriter(outQ1_DoubleStream);
		PrintWriter outCharStream = new PrintWriter(outQ1_CharStream);
		PrintWriter outLongStream = new PrintWriter(outQ1_LongStream);
        
        
        int numberType[] = {0, 0, 0, 0, 0}; // integer boolean double char long

        String line;
        double doubleSum = 0.0;
        
        /**
         * First, find the key type.
         * Second, increase number of selected data type
         * Third, print the encoded cipher into the file
         * If selected key is double, add doubleSum
         */
        while ((line = inDataStream2.readLine()) != null) {
            if (line.equals("int")) { 
            	numberType[0]++;
            	outIntStream.println(inDataStream1.readInt());
            }
            if (line.equals("boolean")) {
            	numberType[1]++;
            	outBooleanStream.println(inDataStream1.readBoolean());
            }
            if (line.equals("double")) {
            	numberType[2]++;
            	double tmp = inDataStream1.readDouble();
            	outDoubleStream.println(tmp);
            	doubleSum += tmp;
            }
            if (line.equals("char")) { 
            	numberType[3]++;
            	outCharStream.println(inDataStream1.readChar());
            }
            if (line.equals("long")) {
            	numberType[4]++;
            	outLongStream.println(inDataStream1.readLong());
            }
        }
        
        System.out.println("The sum of all data of type double as a result of decryption is: " + doubleSum);
        System.out.println("=======================================================");
        System.out.println("# of integer values: " + numberType[0]);
        System.out.println("# of boolean values: " + numberType[1]);
        System.out.println("# of double values: " + numberType[2]);
        System.out.println("# of char values: " + numberType[3]);
        System.out.println("# of long values: " + numberType[4]);
		
        
        inDataStream1.close();
        inDataStream2.close();
        outIntStream.close();
        outBooleanStream.close();
        outDoubleStream.close();
        outCharStream.close();
        outLongStream.close();
        

	}

}
