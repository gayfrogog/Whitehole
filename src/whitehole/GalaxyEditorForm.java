/*
    Copyright 2012 Mega-Mario

    This file is part of Whitehole.

    Whitehole is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    Whitehole is distributed in the hope that it will be useful, but WITHOUT ANY 
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along 
    with Whitehole. If not, see http://www.gnu.org/licenses/.
*/

package whitehole;

import com.jogamp.opengl.util.Animator;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.*;

/**
 *
 * @author lolol
 */
public class GalaxyEditorForm extends javax.swing.JFrame
{

    /**
     * Creates new form GalaxyEditorForm
     */
    public GalaxyEditorForm(String galaxy)
    {
        initComponents();
        galaxyName = galaxy;
        
        GLCanvas glc = new GLCanvas();
        glc.addGLEventListener(new GalaxyRenderer());
        
        Animator anim = new Animator();
        anim.add(glc);
        
        /*pnlGLPanel.*/add(glc, BorderLayout.CENTER);
        glc.setVisible(true);
        
        anim.start();
        //glc.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGLPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout pnlGLPanelLayout = new javax.swing.GroupLayout(pnlGLPanel);
        pnlGLPanel.setLayout(pnlGLPanelLayout);
        pnlGLPanelLayout.setHorizontalGroup(
            pnlGLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        pnlGLPanelLayout.setVerticalGroup(
            pnlGLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pnlGLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(pnlGLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        //
    }//GEN-LAST:event_formWindowOpened

    
    public class GalaxyRenderer implements GLEventListener
    {
        @Override
        public void init(GLAutoDrawable glad)
        {
            GL2 gl = glad.getGL().getGL2();
            
            //gl.glClearColor(0f, 1f, 0f, 1f);
            System.out.println("inited crap");
        }

        @Override
        public void dispose(GLAutoDrawable glad)
        {
            GL2 gl = glad.getGL().getGL2();
            System.out.println("disposed crap");
        }

        @Override
        public void display(GLAutoDrawable glad)
        {
            GL2 gl = glad.getGL().getGL2();
            
            gl.glClearColor(0f, 1f, 0f, 1f);
            gl.glClear(gl.GL_COLOR_BUFFER_BIT);
            
            // draw shit here
            
            //glad.swapBuffers();
            System.out.println("displayed crap");
        }

        @Override
        public void reshape(GLAutoDrawable glad, int x, int y, int width, int height)
        {
            GL2 gl = glad.getGL().getGL2();
            
            gl.setSwapInterval(1);
            gl.glViewport(x, y, width, height);
            System.out.println("resized crap");
        }
    }
    
   
    public String galaxyName;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlGLPanel;
    // End of variables declaration//GEN-END:variables
}