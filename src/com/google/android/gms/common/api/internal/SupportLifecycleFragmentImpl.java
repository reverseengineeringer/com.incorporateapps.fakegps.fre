package com.google.android.gms.common.api.internal;

import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class SupportLifecycleFragmentImpl
  extends zzw
{
  protected void zzb(int paramInt, ConnectionResult paramConnectionResult)
  {
    GooglePlayServicesUtil.showErrorDialogFragment(paramConnectionResult.getErrorCode(), getActivity(), this, 2, this);
  }
  
  protected void zzc(int paramInt, ConnectionResult paramConnectionResult)
  {
    paramConnectionResult = zzpS().zza(getActivity(), this);
    zzaiD = zzn.zza(getActivity().getApplicationContext(), new SupportLifecycleFragmentImpl.1(this, paramConnectionResult));
  }
  
  protected GoogleApiAvailability zzpS()
  {
    return GoogleApiAvailability.getInstance();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.SupportLifecycleFragmentImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */