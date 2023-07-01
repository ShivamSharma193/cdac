using System.Runtime.Serialization;
using System.Threading.Channels;

namespace JaggedArrays
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[][] cdacRecord;
            Console.WriteLine("Enter total number of batches");
            int noOfBatches = Convert.ToInt32(Console.ReadLine());
            
            cdacRecord = new int[noOfBatches][];

            Console.WriteLine("Enter number of students for the batches ");
            for (int batch = 0; batch < cdacRecord.Length; batch++)
            {
                Console.Write($"batch  {batch} : ");
                cdacRecord[batch] = new int[Convert.ToInt32(Console.ReadLine())];
            }


            Console.WriteLine("Enter marks for students ");
            for (int batch = 0; batch < cdacRecord.Length; batch++ ) {
                for (int student=0; student < cdacRecord[batch].Length; student++) {
                    cdacRecord[batch][student] = Convert.ToInt32(Console.ReadLine());
                }
            }
            //foreach (int[] batch in cdacRecord) { 
            //    foreach(int student in batch) { 
            //        Console.WriteLine($"batch : {batch} - student : {student}"); 
            //    } 
            //}

            for (int batch=0; batch<cdacRecord.Length;batch++)
            {
                for(int student=0; student < cdacRecord[batch].Length;student++)
                {
                    Console.WriteLine($"batch : {batch} - student : {student} - marks : {cdacRecord[batch][student]}");
                }
            }

        }
    }


}