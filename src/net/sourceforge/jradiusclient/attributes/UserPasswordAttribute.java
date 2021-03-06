package net.sourceforge.jradiusclient.attributes;

import net.sourceforge.jradiusclient.RadiusAttribute;
import net.sourceforge.jradiusclient.RadiusAttributeValues;
import net.sourceforge.jradiusclient.exception.InvalidParameterException;
/**
 * Released under the LGPL<BR>
 * @author <a href="mailto:bloihl@users.sourceforge.net">Robert J. Loihl</a>
 * @version $Revision: 1.4 $
 */
public class UserPasswordAttribute extends RadiusAttribute {
    /**
     * Constructs a new UserPasswordAttribute for use in RadiusPackets
     * @param plaintext
     * @throws InvalidParameterException
     */
    public UserPasswordAttribute(final String plaintext) throws InvalidParameterException{
        super (RadiusAttributeValues.USER_PASSWORD, plaintext.getBytes());
    }
    /**
     * Constructs a new UserPasswordAttribute for use in RadiusPackets
     * @param plaintext
     * @throws InvalidParameterException
     */
    public UserPasswordAttribute(final byte[] plaintext) throws InvalidParameterException{
        super (RadiusAttributeValues.USER_PASSWORD, plaintext);
    }
}