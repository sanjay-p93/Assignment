package com.EmpFile;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.document.AbstractXlsView;

@Service
public class ExcelBuilder extends AbstractXlsView {


	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<Employee> employees = (List<Employee>) model.get("employees");

		Sheet sheet = workbook.createSheet("Java Books");
		sheet.setDefaultColumnWidth(30);

		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Georgia");
		style.setFont(font);

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.getCell(0).setCellStyle(style);

		header.createCell(1).setCellValue("Name");
		header.getCell(1).setCellStyle(style);
		header.createCell(2).setCellValue("Salary");
		header.getCell(2).setCellStyle(style);

		int rowCount = 1;

		for (Employee emp : employees) {
			Row aRow = sheet.createRow(rowCount++);
			aRow.createCell(0).setCellValue(emp.getId());
			aRow.createCell(1).setCellValue(emp.getName());
			aRow.createCell(2).setCellValue(emp.getSalary());

		}
	}

}