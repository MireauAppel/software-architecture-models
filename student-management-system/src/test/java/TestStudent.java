import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TestStudent {
  private static final Student johnWoo = new Student("John", "Woo");
  private static final Student jeanMichelBruitage = new Student("Jean-Michel", "Bruitage");
  private static final Student davidGoodenough = new Student("David", "Goodenough");

  @BeforeAll
  static void addResultsToStudents(){
    johnWoo.addResult("Programmation 2", TestGrade.twenty);
    johnWoo.addResult("Structures discrètes", TestGrade.twenty);
    davidGoodenough.addResult("Programmation 2", TestGrade.ten);
    davidGoodenough.addResult("Structures discrètes", TestGrade.zero);
    jeanMichelBruitage.addResult("Programmation 2", TestGrade.ten);
    jeanMichelBruitage.addResult("Structures discrètes", TestGrade.twenty);
  }

  @Test
  void testHashCode(){
    assertThat(jeanMichelBruitage.hashCode()).isEqualTo(new Student("Jean-Michel", "Bruitage").hashCode())
            .isNotEqualTo(davidGoodenough.hashCode());
  }

  @Test
  void testEquals(){
    assertThat(jeanMichelBruitage).isEqualTo(new Student("Jean-Michel", "Bruitage"))
            .isNotEqualTo(davidGoodenough)
            .isNotEqualTo(null)
            .isNotEqualTo("Jean-Michel Bruitage");
  }

  @Test
  void testToString() {
    assertThat(jeanMichelBruitage.toString()).isEqualTo("Jean-Michel Bruitage");
    assertThat(davidGoodenough.toString()).isEqualTo("David Goodenough");
  }

  @Test
  void testGetGrades() {
    assertThat(johnWoo.getGrades()).isEqualTo(List.of(TestGrade.twenty, TestGrade.twenty));
    assertThat(davidGoodenough.getGrades()).isEqualTo(List.of(TestGrade.ten, TestGrade.zero));
    assertThat(jeanMichelBruitage.getGrades()).isEqualTo(List.of(TestGrade.ten, TestGrade.twenty));
  }

  @Test
  void testGetAverageGrade() {
    assertThat(johnWoo.averageGrade()).isEqualTo(TestGrade.twenty);
    assertThat(davidGoodenough.averageGrade()).isEqualTo(new Grade(5));
    assertThat(jeanMichelBruitage.averageGrade()).isEqualTo(new Grade(15));
  }

  @Test
  void testPrintResults() {
    StandardOutputSandbox standardOutputSandbox = new StandardOutputSandbox(johnWoo::printResults);
    String expectedOutput =
            "John Woo" + StandardOutputSandbox.NEW_LINE
            + "Programmation 2 : 20.0/20" + StandardOutputSandbox.NEW_LINE
            + "Structures discrètes : 20.0/20" + StandardOutputSandbox.NEW_LINE
            + "Note moyenne : 20.0/20" + StandardOutputSandbox.NEW_LINE;
    standardOutputSandbox.run();
    assertThat(standardOutputSandbox.getProducedOutput()).isEqualTo(expectedOutput);
  }
}