package softwarefundamentals;
/**
 * @author Steven Carleton
 */
public class StudentArray
{
   public static void main (String[] args)
   {
      Student[] classList = new Student[5];
      Student steven = new Student();
      Student travis = new Student();
      Student marc = new Student();
      Student saif = new Student();
      Student bryan = new Student();
      classList[0] = steven;
      classList[1] = travis;
      classList[2] = marc;
      classList[3] = saif;
      classList[4] = bryan;
      steven.setName("Steven");
      travis.setName("Travis");
      marc.setName("Marc");
      saif.setName("Saif");
      bryan.setName("Bryan");
      steven.setProgram("CP");
      travis.setProgram("SA");
      marc.setProgram("SA");
      saif.setProgram("CP");
      bryan.setProgram("SYDNE");
      for (int i = 0; i < classList.length; i++) {
         System.out.println(classList[i].getName());
         System.out.println(classList[i].getProgram());
      }
   }
}
