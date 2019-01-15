// Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program that displays the sizes and ranges of the different primitive data types in Java in the given format. 
class SizePrimitiveTypes
{
  public static void main (String[] args)
  {
    System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
    System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
    System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
    System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
    System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
    System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
    System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
  }
}