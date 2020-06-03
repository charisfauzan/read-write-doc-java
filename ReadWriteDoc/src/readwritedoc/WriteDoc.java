/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritedoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author ASUS
 */
public class WriteDoc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String teks = "Write adalah kebalikan dari read. "
                + "Write secara bahasa berarti menulis, "
                + "artinya menuliskan suatu teks "
                + "untuk dibuat file berekstensi khusus,"
                + " dalam hal ini write dikhususkan untuk "
                + "membuat doc file. Unduh Library khusus "
                + "write doc di libDocWrite. Tiru sebagaimana "
                + "langkah-langkah pada proses Read doc hingga "
                + "sesuai dengan Gambar 4. /n  ini beda paragraf";
        
        
        String direktori = "D://writeDoc.doc";
        XWPFDocument dokumen = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File(direktori));
        XWPFParagraph paragraf = dokumen.createParagraph();
        XWPFRun run = paragraf.createRun();
        run.setText(teks);
        dokumen.write(out);
        out.close();
        
        System.out.println("Sukses");
        
    }
}
