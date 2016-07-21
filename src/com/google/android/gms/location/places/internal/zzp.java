package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import com.google.android.gms.location.places.Places;

public class zzp
  implements PlacePhotoMetadata
{
  private int mIndex;
  private final int zzDF;
  private final int zzDG;
  private final String zzaQR;
  private final CharSequence zzaQS;
  
  public zzp(String paramString, int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3)
  {
    zzaQR = paramString;
    zzDF = paramInt1;
    zzDG = paramInt2;
    zzaQS = paramCharSequence;
    mIndex = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzp)) {
        return false;
      }
      paramObject = (zzp)paramObject;
    } while ((zzDF == zzDF) && (zzDG == zzDG) && (zzw.equal(zzaQR, zzaQR)) && (zzw.equal(zzaQS, zzaQS)));
    return false;
  }
  
  public CharSequence getAttributions()
  {
    return zzaQS;
  }
  
  public int getMaxHeight()
  {
    return zzDG;
  }
  
  public int getMaxWidth()
  {
    return zzDF;
  }
  
  public PendingResult getPhoto(GoogleApiClient paramGoogleApiClient)
  {
    return getScaledPhoto(paramGoogleApiClient, getMaxWidth(), getMaxHeight());
  }
  
  public PendingResult getScaledPhoto(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return paramGoogleApiClient.zza(new zzp.1(this, Places.zzaPN, paramGoogleApiClient, paramInt1, paramInt2));
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzDF), Integer.valueOf(zzDG), zzaQR, zzaQS });
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public PlacePhotoMetadata zzzz()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */