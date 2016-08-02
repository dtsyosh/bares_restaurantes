/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import java.util.List;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author yosh
 * @param <T>
 */
public class GenericREL<T> {

    private Class<T> tipo;

    public GenericREL(Class<T> tipo) {
        this.tipo = tipo;
    }

    public void criarRelatorio(List<T> lista) {
        try {
            String nomeArquivo = lista.get(0).getClass().getSimpleName();
            nomeArquivo = nomeArquivo.substring(0, 1).toUpperCase().concat(nomeArquivo.substring(1));
            
            JasperReport report = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/" + nomeArquivo + ".jrxml"));
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(lista));
            
            String path = System.getProperty("user.home") + "/Documents/" + nomeArquivo + ".pdf";

            JasperExportManager.exportReportToPdfFile(print, path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
