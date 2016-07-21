package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import java.util.List;

public class zza
{
  private static final int zzxI = Color.rgb(12, 174, 206);
  private static final int zzxJ;
  static final int zzxK;
  static final int zzxL = zzxI;
  private final int mTextColor;
  private final String zzxM;
  private final List zzxN;
  private final int zzxO;
  private final int zzxP;
  private final int zzxQ;
  
  static
  {
    int i = Color.rgb(204, 204, 204);
    zzxJ = i;
    zzxK = i;
  }
  
  public zza(String paramString, List paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt)
  {
    zzxM = paramString;
    zzxN = paramList;
    if (paramInteger1 != null)
    {
      i = paramInteger1.intValue();
      zzxO = i;
      if (paramInteger2 == null) {
        break label81;
      }
      i = paramInteger2.intValue();
      label42:
      mTextColor = i;
      if (paramInteger3 == null) {
        break label89;
      }
    }
    label81:
    label89:
    for (int i = paramInteger3.intValue();; i = 12)
    {
      zzxP = i;
      zzxQ = paramInt;
      return;
      i = zzxK;
      break;
      i = zzxL;
      break label42;
    }
  }
  
  public int getBackgroundColor()
  {
    return zzxO;
  }
  
  public String getText()
  {
    return zzxM;
  }
  
  public int getTextColor()
  {
    return mTextColor;
  }
  
  public int getTextSize()
  {
    return zzxP;
  }
  
  public List zzdG()
  {
    return zzxN;
  }
  
  public int zzdH()
  {
    return zzxQ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */