package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;

public final class AppInviteInvitation$IntentBuilder
{
  public static final int MAX_CALL_TO_ACTION_TEXT_LENGTH = 20;
  public static final int MAX_EMAIL_HTML_CONTENT = 512000;
  public static final int MAX_MESSAGE_LENGTH = 100;
  public static final int MIN_CALL_TO_ACTION_TEXT_LENGTH = 2;
  private final Intent mIntent;
  private String zzUL;
  private String zzUM;
  
  public AppInviteInvitation$IntentBuilder(CharSequence paramCharSequence)
  {
    zzx.zzz(paramCharSequence);
    mIntent = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");
    mIntent.putExtra("com.google.android.gms.appinvite.TITLE", paramCharSequence);
    mIntent.setPackage("com.google.android.gms");
  }
  
  public final Intent build()
  {
    if (!TextUtils.isEmpty(zzUL))
    {
      zzx.zzh(zzUM, "Email html content must be set when email subject is set.");
      if (mIntent.getData() == null)
      {
        bool = true;
        zzx.zzb(bool, "Custom image must not be set when email html content is set.");
        zzx.zzb(TextUtils.isEmpty(mIntent.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT")), "Call to action text must not be set when email html content is set.");
        mIntent.putExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT", zzUL);
        mIntent.putExtra("com.google.android.gms.appinvite.EMAIL_CONTENT", zzUM);
      }
    }
    while (TextUtils.isEmpty(zzUM)) {
      for (;;)
      {
        return mIntent;
        boolean bool = false;
      }
    }
    throw new IllegalArgumentException("Email subject must be set when email html content is set.");
  }
  
  public final IntentBuilder setAccount(Account paramAccount)
  {
    if ((paramAccount != null) && ("com.google".equals(type)))
    {
      mIntent.putExtra("com.google.android.gms.appinvite.ACCOUNT_NAME", paramAccount);
      return this;
    }
    mIntent.removeExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
    return this;
  }
  
  public final IntentBuilder setAdditionalReferralParameters(Map paramMap)
  {
    if (paramMap != null)
    {
      mIntent.putExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI", AppInviteInvitation.zzK(paramMap));
      return this;
    }
    mIntent.removeExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
    return this;
  }
  
  public final IntentBuilder setAndroidMinimumVersionCode(int paramInt)
  {
    mIntent.putExtra("com.google.android.gms.appinvite.appMinimumVersionCode", paramInt);
    return this;
  }
  
  public final IntentBuilder setCallToActionText(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() < 2) || (paramCharSequence.length() > 20)) {
      throw new IllegalArgumentException(String.format("Text must be between %d and %d chars in length.", new Object[] { Integer.valueOf(2), Integer.valueOf(20) }));
    }
    mIntent.putExtra("com.google.android.gms.appinvite.BUTTON_TEXT", paramCharSequence);
    return this;
  }
  
  public final IntentBuilder setCustomImage(Uri paramUri)
  {
    boolean bool2 = false;
    zzx.zzz(paramUri);
    zzx.zzb(paramUri.isAbsolute(), "Image uri is not an absolute uri. Did you forget to add a scheme to the Uri?");
    String str2 = paramUri.getScheme().toLowerCase();
    int i;
    boolean bool1;
    label84:
    String str1;
    if ((str2.equals("android.resource")) || (str2.equals("content")) || (str2.equals("file")))
    {
      i = 1;
      if ((i == 0) && (!str2.equals("http")) && (!str2.equals("https"))) {
        break label216;
      }
      bool1 = true;
      zzx.zzb(bool1, "Image uri must be a content URI with scheme \"android.resource\", \"content\" or \"file\", or a network url with scheme \"http\" or \"https\".");
      if (i == 0)
      {
        str1 = paramUri.toString();
        str1 = str1.substring(str1.lastIndexOf("/") + 1, str1.length());
        if (str1 != null) {
          break label221;
        }
        str1 = null;
      }
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(str1))
      {
        bool1 = bool2;
        if (!AppInviteInvitation.zzbF(str1)) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zzb(bool1, str1 + " images are not supported. Only jpg, jpeg, or png images are supported.");
      paramUri = paramUri.buildUpon().scheme(str2).build();
      mIntent.setData(paramUri);
      if (i != 0) {
        mIntent.addFlags(1);
      }
      return this;
      i = 0;
      break;
      label216:
      bool1 = false;
      break label84;
      label221:
      if (str1.lastIndexOf(".") == -1) {
        str1 = null;
      } else {
        str1 = str1.substring(str1.lastIndexOf(".") + 1, str1.length()).toLowerCase();
      }
    }
  }
  
  public final IntentBuilder setDeepLink(Uri paramUri)
  {
    if (paramUri != null)
    {
      mIntent.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", paramUri);
      return this;
    }
    mIntent.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
    return this;
  }
  
  public final IntentBuilder setEmailHtmlContent(String paramString)
  {
    if ((paramString != null) && (paramString.getBytes().length > 512000)) {
      throw new IllegalArgumentException(String.format("Email html content must be %d bytes or less.", new Object[] { Integer.valueOf(512000) }));
    }
    zzUM = paramString;
    return this;
  }
  
  public final IntentBuilder setEmailSubject(String paramString)
  {
    zzUL = paramString;
    return this;
  }
  
  public final IntentBuilder setGoogleAnalyticsTrackingId(String paramString)
  {
    mIntent.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", paramString);
    return this;
  }
  
  public final IntentBuilder setMessage(CharSequence paramCharSequence)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 100)) {
      throw new IllegalArgumentException(String.format("Message must be %d chars or less.", new Object[] { Integer.valueOf(100) }));
    }
    mIntent.putExtra("com.google.android.gms.appinvite.MESSAGE", paramCharSequence);
    return this;
  }
  
  public final IntentBuilder setOtherPlatformsTargetApplication(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("targetPlatform must be either PROJECT_PLATFORM_IOS or PROJECT_PLATFORM_ANDROID.");
    case 1: 
      mIntent.putExtra("com.google.android.gms.appinvite.iosTargetApplication", paramString);
      return this;
    }
    mIntent.putExtra("com.google.android.gms.appinvite.androidTargetApplication", paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appinvite.AppInviteInvitation.IntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */