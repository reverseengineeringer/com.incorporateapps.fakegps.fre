package com.google.android.gms.internal;

import java.security.MessageDigest;

public class zzbj
  extends zzbg
{
  private MessageDigest zztw;
  
  byte[] zza(String[] paramArrayOfString)
  {
    byte[] arrayOfByte = new byte[paramArrayOfString.length];
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      arrayOfByte[i] = zzk(zzbi.zzx(paramArrayOfString[i]));
      i += 1;
    }
    return arrayOfByte;
  }
  
  byte zzk(int paramInt)
  {
    return (byte)(paramInt & 0xFF ^ (0xFF00 & paramInt) >> 8 ^ (0xFF0000 & paramInt) >> 16 ^ (0xFF000000 & paramInt) >> 24);
  }
  
  public byte[] zzu(String arg1)
  {
    int i = 4;
    byte[] arrayOfByte1 = zza(???.split(" "));
    zztw = zzcL();
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zztw == null) {
          return new byte[0];
        }
        zztw.reset();
        zztw.update(arrayOfByte1);
        arrayOfByte1 = zztw.digest();
        if (arrayOfByte1.length > 4)
        {
          byte[] arrayOfByte2 = new byte[i];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
          return arrayOfByte2;
        }
      }
      i = localObject.length;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */