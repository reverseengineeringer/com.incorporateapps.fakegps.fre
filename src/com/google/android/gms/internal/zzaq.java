package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class zzaq
{
  private final zzap zznF;
  private final SecureRandom zzox;
  
  public zzaq(zzap paramzzap, SecureRandom paramSecureRandom)
  {
    zznF = paramzzap;
    zzox = paramSecureRandom;
  }
  
  static void zze(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ 0x44));
      i += 1;
    }
  }
  
  public byte[] zzc(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length != 16) {
      throw new zzaq.zza(this);
    }
    try
    {
      arrayOfByte = zznF.zza(paramString, false);
      if (arrayOfByte.length <= 16) {
        throw new zzaq.zza(this);
      }
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
      Object localObject = ByteBuffer.allocate(arrayOfByte.length);
      ((ByteBuffer)localObject).put(arrayOfByte);
      ((ByteBuffer)localObject).flip();
      paramString = new byte[16];
      byte[] arrayOfByte = new byte[arrayOfByte.length - 16];
      ((ByteBuffer)localObject).get(paramString);
      ((ByteBuffer)localObject).get(arrayOfByte);
      paramArrayOfByte = new SecretKeySpec(paramArrayOfByte, "AES");
      localObject = Cipher.getInstance("AES/CBC/PKCS5Padding");
      ((Cipher)localObject).init(2, paramArrayOfByte, new IvParameterSpec(paramString));
      paramArrayOfByte = ((Cipher)localObject).doFinal(arrayOfByte);
      return paramArrayOfByte;
    }
    catch (InvalidKeyException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
    }
    catch (IllegalBlockSizeException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
    }
    catch (NoSuchPaddingException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
    }
    catch (BadPaddingException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
    }
    catch (InvalidAlgorithmParameterException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
    }
    catch (IllegalArgumentException paramArrayOfByte)
    {
      throw new zzaq.zza(this, paramArrayOfByte);
    }
  }
  
  public byte[] zzl(String paramString)
  {
    try
    {
      paramString = zznF.zza(paramString, false);
      if (paramString.length != 32) {
        throw new zzaq.zza(this);
      }
    }
    catch (IllegalArgumentException paramString)
    {
      throw new zzaq.zza(this, paramString);
    }
    paramString = ByteBuffer.wrap(paramString, 4, 16);
    byte[] arrayOfByte = new byte[16];
    paramString.get(arrayOfByte);
    zze(arrayOfByte);
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */