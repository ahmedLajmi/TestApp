<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<body>
		<h1> STUDENT ADMISSION FORM ENGINEERING COURSES</h1>
		
		<form:errors path="student1.*" />
		
		<form action="/FirstApp/SubmitAdmissionForm" method="post">
			<table> 
				<tr>
					<td>Student's Name :</td>
					<td><input type="text" name="studentName" ></td>
				</tr>
				<tr>
					<td>Student's Hobby :</td>
					<td><input type="text" name="studentHobby" ></td>
				</tr>
				<tr>
					<td>Student's Mobile :</td>
					<td><input type="text" name="studentMobile" ></td>
				</tr>
				<tr>
					<td>Student's DOB :</td>
					<td><input type="text" name="studentDOB" ></td>
				</tr>
				<tr>
					<td>Student's Skills set :</td>
					<td>
						<select name="studentSkills" multiple>
							<option value="Java Core">Java Core</option>
							<option value="Spring Core">Spring Core</option>
							<option value="Spring MVC">Spring MVC</option>
						</select>	
					</td>
				</tr>
			</table>
			<input type="submit" value="Submit this form by clicking here"  />
			
		</form>
	</body>
</html>