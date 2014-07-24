/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolkit;

import java.io.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Rodot
 */
public class BitmapFrame extends javax.swing.JFrame {

    BitmapEncoder encoder = new BitmapEncoder();
    final JFileChooser fileChooser = new JFileChooser();

    /**
     * Creates new form BitmapFrame
     */
    public BitmapFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        originalPanel = new javax.swing.JPanel();
        original = new javax.swing.JLabel();
        previewPanel = new javax.swing.JPanel();
        preview = new javax.swing.JLabel();
        thresholdSlider = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        outputScrollPane = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        scaleSlider = new javax.swing.JSlider();
        scaleLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        formattingBox = new javax.swing.JComboBox();
        formattingLabel = new javax.swing.JLabel();
        wrapCheckbox = new javax.swing.JCheckBox();
        wrapLabel = new javax.swing.JLabel();
        ditheringBox = new javax.swing.JComboBox();
        ditheringLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gamebuino Bitmap Encoder");
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("bitmapFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        message.setText("Please select a file to encode");

        originalPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        originalPanel.setMaximumSize(new java.awt.Dimension(400, 400));
        originalPanel.setMinimumSize(new java.awt.Dimension(120, 120));
        originalPanel.setPreferredSize(new java.awt.Dimension(120, 120));

        original.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        original.setText("original");

        javax.swing.GroupLayout originalPanelLayout = new javax.swing.GroupLayout(originalPanel);
        originalPanel.setLayout(originalPanelLayout);
        originalPanelLayout.setHorizontalGroup(
            originalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(original, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        originalPanelLayout.setVerticalGroup(
            originalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(original, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        previewPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        previewPanel.setMaximumSize(new java.awt.Dimension(400, 400));
        previewPanel.setMinimumSize(new java.awt.Dimension(120, 120));
        previewPanel.setPreferredSize(new java.awt.Dimension(120, 120));

        preview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview.setText("preview");

        javax.swing.GroupLayout previewPanelLayout = new javax.swing.GroupLayout(previewPanel);
        previewPanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(preview, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        thresholdSlider.setMaximum(765);
        thresholdSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        thresholdSlider.setToolTipText("Use to adjust the thresold between black and white.");
        thresholdSlider.setValue(384);
        thresholdSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        thresholdSlider.setMaximumSize(new java.awt.Dimension(20, 32767));
        thresholdSlider.setMinimumSize(new java.awt.Dimension(20, 36));
        thresholdSlider.setPreferredSize(new java.awt.Dimension(20, 150));
        thresholdSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                thresholdSliderMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(originalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(previewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thresholdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(openButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(message)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thresholdSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(originalPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previewPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));

        outputScrollPane.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        outputScrollPane.setPreferredSize(new java.awt.Dimension(200, 200));

        outputText.setColumns(20);
        outputText.setRows(5);
        outputText.setAutoscrolls(false);
        outputScrollPane.setViewportView(outputText);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

        scaleSlider.setMaximum(4);
        scaleSlider.setMinimum(1);
        scaleSlider.setMinorTickSpacing(1);
        scaleSlider.setPaintLabels(true);
        scaleSlider.setPaintTicks(true);
        scaleSlider.setSnapToTicks(true);
        scaleSlider.setValue(2);
        scaleSlider.setMaximumSize(new java.awt.Dimension(150, 31));
        scaleSlider.setMinimumSize(new java.awt.Dimension(150, 31));
        scaleSlider.setPreferredSize(new java.awt.Dimension(150, 31));
        scaleSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                scaleSliderStateChanged(evt);
            }
        });

        scaleLabel.setText("Preview scale");

        nameText.setText("myBitmap");

        nameLabel.setText("Variable name");

        formattingBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binary (ex: B00110010)", "Hexadecimal (ex: 0x32)" }));
        formattingBox.setName(""); // NOI18N
        formattingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattingBoxActionPerformed(evt);
            }
        });

        formattingLabel.setText("Output number formatting");

        wrapCheckbox.setSelected(true);
        wrapCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrapCheckboxActionPerformed(evt);
            }
        });

        wrapLabel.setText("Wrap output lines");

        ditheringBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thresold", "Atkinson" }));

        ditheringLabel.setText("Dithering");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ditheringBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wrapCheckbox)
                    .addComponent(formattingBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scaleSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(scaleLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(formattingLabel)
                            .addComponent(wrapLabel)
                            .addComponent(ditheringLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(scaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(scaleSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formattingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formattingBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wrapCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wrapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ditheringBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ditheringLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scaleSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_scaleSliderStateChanged
        redrawPreview();
    }//GEN-LAST:event_scaleSliderStateChanged

    private void formattingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattingBoxActionPerformed
        if (formattingBox.getSelectedIndex() == 1) {
            encoder.hexFormatting = true;
        } else {
            encoder.hexFormatting = false;
        }
        updateOutput();
    }//GEN-LAST:event_formattingBoxActionPerformed

    private void wrapCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrapCheckboxActionPerformed
        if (wrapCheckbox.isSelected()) {
            encoder.wrapping = true;
        } else {
            encoder.wrapping = false;
        }
        updateOutput();
    }//GEN-LAST:event_wrapCheckboxActionPerformed

    private void thresholdSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thresholdSliderMouseReleased
        if (encoder.inputImage == null) {
            message.setText("Open a image before you play with that slider!");
        } else {
            message.setText("Loading...");
            redrawPreview();
            message.setText("Output updated");
        }
    }//GEN-LAST:event_thresholdSliderMouseReleased

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(BitmapFrame.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            encoder.open(file);
            if (encoder.inputImage == null) {
                message.setText("Can't open the selected image");
            } else {
                message.setText("Image succesfully loaded");
                redrawPreview();
            }
        }
    }//GEN-LAST:event_openButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
             if ("Nimbus".equals(info.getName())) {
             javax.swing.UIManager.setLookAndFeel(info.getClassName());
             break;
             }
             }*/
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BitmapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BitmapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BitmapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BitmapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BitmapFrame().setVisible(true);
            }
        });
    }

    public void redrawPreview() {
        int scale = scaleSlider.getValue();
        //input image
        Image in = BitmapEncoder.deepCopy(encoder.inputImage);
        in = in.getScaledInstance(in.getWidth(null) * scale, in.getHeight(null) * scale, java.awt.Image.SCALE_REPLICATE);
        ImageIcon originalIcon = new ImageIcon(in);
        original.setText("");
        original.setIcon(originalIcon);
        //output image
        encoder.threshold(thresholdSlider.getValue());
        Image out = BitmapEncoder.deepCopy(encoder.outputImage);
        out = out.getScaledInstance(out.getWidth(null) * scale, out.getHeight(null) * scale, java.awt.Image.SCALE_REPLICATE);
        ImageIcon previewIcon = new ImageIcon(out);
        preview.setText("");
        preview.setIcon(previewIcon);
        updateOutput();
    }

    public void updateOutput() {
        encoder.encode(thresholdSlider.getValue());
        outputText.setText(encoder.output);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ditheringBox;
    private javax.swing.JLabel ditheringLabel;
    private javax.swing.JComboBox formattingBox;
    private javax.swing.JLabel formattingLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel message;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel original;
    private javax.swing.JPanel originalPanel;
    private javax.swing.JScrollPane outputScrollPane;
    private javax.swing.JTextArea outputText;
    private javax.swing.JLabel preview;
    private javax.swing.JPanel previewPanel;
    private javax.swing.JLabel scaleLabel;
    private javax.swing.JSlider scaleSlider;
    private javax.swing.JSlider thresholdSlider;
    private javax.swing.JCheckBox wrapCheckbox;
    private javax.swing.JLabel wrapLabel;
    // End of variables declaration//GEN-END:variables
}