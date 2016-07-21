package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.location.places.internal.zzn;

public class PlaceLikelihoodBuffer
  extends AbstractDataBuffer
  implements Result
{
  private final Context mContext;
  private final Status zzUX;
  private final String zzaPy;
  private final int zzvr;
  
  public PlaceLikelihoodBuffer(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder);
    mContext = paramContext;
    zzUX = PlacesStatusCodes.zzhU(paramDataHolder.getStatusCode());
    zzvr = PlaceLikelihoodBuffer.zza.zzhP(paramInt);
    if ((paramDataHolder != null) && (paramDataHolder.zzpZ() != null))
    {
      zzaPy = paramDataHolder.zzpZ().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
      return;
    }
    zzaPy = null;
  }
  
  public static int zzH(Bundle paramBundle)
  {
    return paramBundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
  }
  
  public PlaceLikelihood get(int paramInt)
  {
    return new zzn(zzahi, paramInt, mContext);
  }
  
  public CharSequence getAttributions()
  {
    return zzaPy;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", getStatus()).zzg("attributions", zzaPy).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlaceLikelihoodBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */