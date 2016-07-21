package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import org.json.JSONException;
import org.json.JSONObject;

public class SignInAccount
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  final int versionCode;
  private String zzWP;
  private String zzWQ;
  private Uri zzWR;
  private String zzWk;
  private String zzXj;
  private GoogleSignInAccount zzXm;
  private String zzXn;
  private String zzrG;
  
  SignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, GoogleSignInAccount paramGoogleSignInAccount, String paramString5, String paramString6)
  {
    versionCode = paramInt;
    zzWP = zzx.zzh(paramString3, "Email cannot be empty.");
    zzWQ = paramString4;
    zzWR = paramUri;
    zzXj = paramString1;
    zzWk = paramString2;
    zzXm = paramGoogleSignInAccount;
    zzrG = zzx.zzcM(paramString5);
    zzXn = paramString6;
  }
  
  public static SignInAccount zza(zzd paramzzd, String paramString1, String paramString2, String paramString3, Uri paramUri, String paramString4, String paramString5)
  {
    String str = null;
    if (paramzzd != null) {
      str = paramzzd.zzmT();
    }
    return new SignInAccount(2, str, paramString1, paramString2, paramString3, paramUri, null, paramString4, paramString5);
  }
  
  public static SignInAccount zzbM(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = Uri.parse(paramString);; paramString = null) {
      return zza(zzd.zzbL(localJSONObject.optString("providerId", null)), localJSONObject.optString("tokenId", null), localJSONObject.getString("email"), localJSONObject.optString("displayName", null), paramString, localJSONObject.getString("localId"), localJSONObject.optString("refreshToken")).zza(GoogleSignInAccount.zzbH(localJSONObject.optString("googleSignInAccount")));
    }
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("email", getEmail());
      if (!TextUtils.isEmpty(zzWQ)) {
        localJSONObject.put("displayName", zzWQ);
      }
      if (zzWR != null) {
        localJSONObject.put("photoUrl", zzWR.toString());
      }
      if (!TextUtils.isEmpty(zzXj)) {
        localJSONObject.put("providerId", zzXj);
      }
      if (!TextUtils.isEmpty(zzWk)) {
        localJSONObject.put("tokenId", zzWk);
      }
      if (zzXm != null) {
        localJSONObject.put("googleSignInAccount", zzXm.zzmI());
      }
      if (!TextUtils.isEmpty(zzXn)) {
        localJSONObject.put("refreshToken", zzXn);
      }
      localJSONObject.put("localId", getUserId());
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDisplayName()
  {
    return zzWQ;
  }
  
  public String getEmail()
  {
    return zzWP;
  }
  
  public String getIdToken()
  {
    return zzWk;
  }
  
  public Uri getPhotoUrl()
  {
    return zzWR;
  }
  
  public String getUserId()
  {
    return zzrG;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public SignInAccount zza(GoogleSignInAccount paramGoogleSignInAccount)
  {
    zzXm = paramGoogleSignInAccount;
    return this;
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  String zzmT()
  {
    return zzXj;
  }
  
  public zzd zzmU()
  {
    return zzd.zzbL(zzXj);
  }
  
  public GoogleSignInAccount zzmV()
  {
    return zzXm;
  }
  
  public String zzmW()
  {
    return zzXn;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.SignInAccount
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */