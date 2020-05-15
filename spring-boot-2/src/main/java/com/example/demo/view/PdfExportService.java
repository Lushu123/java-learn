package com.example.demo.view;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//PDF导出接口
public interface PdfExportService {

     void make(Map<String,Object> map, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response);
}
