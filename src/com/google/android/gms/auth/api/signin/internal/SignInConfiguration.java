package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.EmailSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import org.json.JSONException;
import org.json.JSONObject;

public final class SignInConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzp();
  final int versionCode;
  private final String zzXL;
  private EmailSignInOptions zzXM;
  private GoogleSignInOptions zzXN;
  private String zzXO;
  private String zzXd;
  
  SignInConfiguration(int paramInt, String paramString1, String paramString2, EmailSignInOptions paramEmailSignInOptions, GoogleSignInOptions paramGoogleSignInOptions, String paramString3)
  {
    versionCode = paramInt;
    zzXL = zzx.zzcM(paramString1);
    zzXd = paramString2;
    zzXM = paramEmailSignInOptions;
    zzXN = paramGoogleSignInOptions;
    zzXO = paramString3;
  }
  
  public SignInConfiguration(String paramString)
  {
    this(2, paramString, null, null, null, null);
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("consumerPackageName", zzXL);
      if (!TextUtils.isEmpty(zzXd)) {
        localJSONObject.put("serverClientId", zzXd);
      }
      if (zzXM != null) {
        localJSONObject.put("emailSignInOptions", zzXM.zzmI());
      }
      if (zzXN != null) {
        localJSONObject.put("googleSignInOptions", zzXN.zzmI());
      }
      if (!TextUtils.isEmpty(zzXO)) {
        localJSONObject.put("apiKey", zzXO);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramObject = (SignInConfiguration)paramObject;
        if (zzXL.equals(((SignInConfiguration)paramObject).zznk()))
        {
          if (TextUtils.isEmpty(zzXd))
          {
            if (!TextUtils.isEmpty(((SignInConfiguration)paramObject).zzmR())) {
              continue;
            }
            label45:
            if (!TextUtils.isEmpty(zzXO)) {
              break label113;
            }
            if (!TextUtils.isEmpty(((SignInConfiguration)paramObject).zznn())) {
              continue;
            }
            label65:
            if (zzXM != null) {
              break label130;
            }
            if (((SignInConfiguration)paramObject).zznl() != null) {
              continue;
            }
          }
          for (;;)
          {
            if (zzXN != null) {
              break label147;
            }
            if (((SignInConfiguration)paramObject).zznm() != null) {
              break;
            }
            break label169;
            if (!zzXd.equals(((SignInConfiguration)paramObject).zzmR())) {
              break;
            }
            break label45;
            label113:
            if (!zzXO.equals(((SignInConfiguration)paramObject).zznn())) {
              break;
            }
            break label65;
            label130:
            if (!zzXM.equals(((SignInConfiguration)paramObject).zznl())) {
              break;
            }
          }
          label147:
          boolean bool = zzXN.equals(((SignInConfiguration)paramObject).zznm());
          if (!bool) {}
        }
      }
      catch (ClassCastException paramObject)
      {
        return false;
      }
    }
    label169:
    return true;
  }
  
  public final int hashCode()
  {
    return new zze().zzp(zzXL).zzp(zzXd).zzp(zzXO).zzp(zzXM).zzp(zzXN).zzne();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
  
  public final SignInConfiguration zzj(GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzXN = ((GoogleSignInOptions)zzx.zzb(paramGoogleSignInOptions, "GoogleSignInOptions cannot be null."));
    return this;
  }
  
  public final String zzmI()
  {
    return zzmJ().toString();
  }
  
  public final String zzmR()
  {
    return zzXd;
  }
  
  public final String zznk()
  {
    return zzXL;
  }
  
  public final EmailSignInOptions zznl()
  {
    return zzXM;
  }
  
  public final GoogleSignInOptions zznm()
  {
    return zzXN;
  }
  
  public final String zznn()
  {
    return zzXO;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.SignInConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */