/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleFlight;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


/**
 *
 * @author mch
 */
class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(OutputStream out)throws IOException {
        super(out);
    }
     @Override
    protected void writeStreamHeader() throws IOException {}
    
}
