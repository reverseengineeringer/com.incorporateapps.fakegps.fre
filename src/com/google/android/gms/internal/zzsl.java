package com.google.android.gms.internal;

public class zzsl
{
  private final byte[] zzbtW = new byte['Ā'];
  private int zzbtX;
  private int zzbtY;
  
  public zzsl(byte[] paramArrayOfByte)
  {
    int j = 0;
    while (j < 256)
    {
      zzbtW[j] = ((byte)j);
      j += 1;
    }
    int k = 0;
    j = 0;
    while (j < 256)
    {
      k = k + zzbtW[j] + paramArrayOfByte[(j % paramArrayOfByte.length)] & 0xFF;
      int i = zzbtW[j];
      zzbtW[j] = zzbtW[k];
      zzbtW[k] = i;
      j += 1;
    }
    zzbtX = 0;
    zzbtY = 0;
  }
  
  public void zzC(byte[] paramArrayOfByte)
  {
    int m = zzbtX;
    int k = zzbtY;
    int j = 0;
    while (j < paramArrayOfByte.length)
    {
      m = m + 1 & 0xFF;
      k = k + zzbtW[m] & 0xFF;
      int i = zzbtW[m];
      zzbtW[m] = zzbtW[k];
      zzbtW[k] = i;
      paramArrayOfByte[j] = ((byte)(paramArrayOfByte[j] ^ zzbtW[(zzbtW[m] + zzbtW[k] & 0xFF)]));
      j += 1;
    }
    zzbtX = m;
    zzbtY = k;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */