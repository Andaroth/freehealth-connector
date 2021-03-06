package be.fgov.ehealth.technicalconnector.ra.service;

import org.taktik.connector.technical.exception.TechnicalConnectorException;
import be.fgov.ehealth.technicalconnector.ra.domain.Result;
import java.security.PublicKey;

public interface EncryptionTokenRegistrationService {
   byte[] registerPublicKey(PublicKey var1) throws TechnicalConnectorException;

   Result<Void> registerToken(byte[] var1) throws TechnicalConnectorException;

   Result<Void> activateToken() throws TechnicalConnectorException;
}
