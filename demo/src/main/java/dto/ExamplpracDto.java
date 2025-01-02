package dto;

import java.util.List;

import com.example.demo.entity.Examplprac;

import lombok.Data;
@Data
public class ExamplpracDto {
	
	
	  private List<Examplprac> status;
	  
	  private String message;
	  
	  public ExamplpracDto(List<Examplprac> status,String message) {
	  
	  this.status=status; this.message=message; }
	 

}
