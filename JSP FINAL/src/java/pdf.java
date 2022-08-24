import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.*;
import com.itextpdf.layout.borders.*;
import com.itextpdf.io.image.*;
import com.itextpdf.kernel.font.*;
import com.itextpdf.io.font.constants.*;
import com.itextpdf.kernel.colors.ColorConstants;
import java.io.*; 

class session{
 public static Object getAttribute(String s){
     Object object="Something";
if(s.equals("student_name"))
    object="link7";
return object;
 }
}
 class pdf {
void createForm(){
    try
{
PdfWriter pdfWriter=new PdfWriter(new File((String)session.getAttribute("student_name")+".pdf"));
PdfDocument pdfDocument=new PdfDocument(pdfWriter);
Document document= new Document(pdfDocument);
Image logo=new Image(ImageDataFactory.create(this.getClass().getResource("images/IBM.png")));
Paragraph paragraph;
Cell cell;
PdfFont companyNameFont=PdfFontFactory.createFont(StandardFonts.TIMES_BOLDITALIC);
PdfFont headingFont=PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
PdfFont titleFont=PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
PdfFont dataFont=PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);


document.setMargins(20,20,20,20);
float topTableWidth[]={2,5,3};
Table topTable=new Table(UnitValue.createPercentArray(topTableWidth));
topTable.setWidth(UnitValue.createPercentValue(100));

Paragraph logoParagraph=new Paragraph();
logoParagraph.add(logo);
Cell logoCell=new Cell();
logoCell.setBorder(Border.NO_BORDER);
logoCell.add(logoParagraph);
topTable.addCell(logoCell);

Paragraph companyNameParagraph=new Paragraph("International Business Machines");
companyNameParagraph.setFont(companyNameFont);
companyNameParagraph.setFontSize(32);
companyNameParagraph.setFontColor(ColorConstants.RED);

cell=new Cell(1,2);
cell.setBorder(Border.NO_BORDER);
cell.add(companyNameParagraph);
cell.setVerticalAlignment(VerticalAlignment.MIDDLE);
topTable.addCell(cell);

for(int e=0;e<=2;e++)
{
cell=new Cell(1,3);
cell.setBorder(Border.NO_BORDER);
topTable.addCell(cell);
}

paragraph=new Paragraph("SVIIT Internship 2021-22");
paragraph.setFont(headingFont);
paragraph.setFontSize(20);
paragraph.setFontColor(ColorConstants.BLACK);
cell=new Cell(1,3);
cell.setBorder(Border.NO_BORDER);
cell.add(paragraph);
cell.setTextAlignment(TextAlignment.CENTER);
topTable.addCell(cell);

paragraph=new Paragraph("Phase-1");
paragraph.setFont(headingFont);
paragraph.setFontSize(18);
paragraph.setFontColor(ColorConstants.BLACK);
cell=new Cell(1,3);
cell.setBorder(Border.NO_BORDER);
cell.add(paragraph);
cell.setTextAlignment(TextAlignment.CENTER);
topTable.addCell(cell);



for(int e=0;e<=2;e++)
{
cell=new Cell(1,3);
cell.setBorder(Border.NO_BORDER);
topTable.addCell(cell);
}



for(int e=0;e<=2;e++)
{
cell=new Cell(1,3);
cell.setBorder(Border.NO_BORDER);
topTable.addCell(cell);
}

Paragraph titleParagraph=new Paragraph("Information");
titleParagraph.setFont(titleFont);
titleParagraph.setFontSize(18);
titleParagraph.setFontColor(ColorConstants.DARK_GRAY);
cell=new Cell(1,3);
cell.add(titleParagraph);
cell.setTextAlignment(TextAlignment.CENTER);
topTable.addCell(cell);
document.add(topTable);


float dataTableWidth[]={1,5,5};
Table dataTable=new Table(UnitValue.createPercentArray(dataTableWidth));
dataTable.setWidth(UnitValue.createPercentValue(100));
 
Object data[][]={
{1,"Email",(String)session.getAttribute("email")},
{2," Name",(String)session.getAttribute("student_name")},
{3,"SurName",(String)session.getAttribute("student_surname")},
{4,"Enrollment_Number",(String)session.getAttribute("enrollment_number")},
{5,"Specialization",(String)session.getAttribute("specialization")},
{6,"Mentor_phone",(String)session.getAttribute("mentor_phone")},
{7,"File_Path_Name",(String)session.getAttribute("file_Path_name")},
{8,"Percentage",(String)session.getAttribute("percentage")}, 
{9,"Grade",(String)session.getAttribute("grade")},
{10,"Score",(String)session.getAttribute("score")}
};


for(int r=0;r<data.length;r++)
{
for(int c=0;c<data[r].length;c++)
{
paragraph=new Paragraph(data[r][c].toString());
paragraph.setFont(dataFont);
paragraph.setFontSize(18);
paragraph.setFontColor(ColorConstants.DARK_GRAY);
if(c==0) paragraph.setTextAlignment(TextAlignment.RIGHT);
cell=new Cell();
cell.add(paragraph);
dataTable.addCell(cell);
}
}
document.add(dataTable);
document.close();
}catch(Exception e)
{
System.out.println(e);
}

}
public static void main(String gg[])
{
pdf Pdf=new pdf();
Pdf.createForm();
}
}