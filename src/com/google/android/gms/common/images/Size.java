package com.google.android.gms.common.images;

public final class Size
{
  private final int zzoG;
  private final int zzoH;
  
  public Size(int paramInt1, int paramInt2)
  {
    zzoG = paramInt1;
    zzoH = paramInt2;
  }
  
  public static Size parseSize(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("string must not be null");
    }
    int j = paramString.indexOf('*');
    int i = j;
    if (j < 0) {
      i = paramString.indexOf('x');
    }
    if (i < 0) {
      throw zzcC(paramString);
    }
    try
    {
      Size localSize = new Size(Integer.parseInt(paramString.substring(0, i)), Integer.parseInt(paramString.substring(i + 1)));
      return localSize;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw zzcC(paramString);
    }
  }
  
  private static NumberFormatException zzcC(String paramString)
  {
    throw new NumberFormatException("Invalid Size: \"" + paramString + "\"");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
        if (this == paramObject) {
          return true;
        }
      } while (!(paramObject instanceof Size));
      paramObject = (Size)paramObject;
    } while ((zzoG != zzoG) || (zzoH != zzoH));
    return true;
  }
  
  public final int getHeight()
  {
    return zzoH;
  }
  
  public final int getWidth()
  {
    return zzoG;
  }
  
  public final int hashCode()
  {
    return zzoH ^ (zzoG << 16 | zzoG >>> 16);
  }
  
  public final String toString()
  {
    return zzoG + "x" + zzoH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.Size
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */