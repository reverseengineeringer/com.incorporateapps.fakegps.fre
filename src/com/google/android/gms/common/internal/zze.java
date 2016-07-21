package com.google.android.gms.common.internal;

import java.util.Arrays;

public abstract class zze
{
  public static final zze zzakF = zza("\t\n\013\f\r     　 ᠎ ").zza(zza(' ', ' '));
  public static final zze zzakG = zza("\t\n\013\f\r     　").zza(zza(' ', ' ')).zza(zza(' ', ' '));
  public static final zze zzakH = zza('\000', '');
  public static final zze zzakI;
  public static final zze zzakJ = zza('\t', '\r').zza(zza('\034', ' ')).zza(zzc(' ')).zza(zzc('᠎')).zza(zza(' ', ' ')).zza(zza(' ', '​')).zza(zza(' ', ' ')).zza(zzc(' ')).zza(zzc('　'));
  public static final zze zzakK = new zze.1();
  public static final zze zzakL = new zze.5();
  public static final zze zzakM = new zze.6();
  public static final zze zzakN = new zze.7();
  public static final zze zzakO = new zze.8();
  public static final zze zzakP = zza('\000', '\037').zza(zza('', ''));
  public static final zze zzakQ = zza('\000', ' ').zza(zza('', ' ')).zza(zzc('­')).zza(zza('؀', '؃')).zza(zza("۝܏ ឴឵᠎")).zza(zza(' ', '‏')).zza(zza(' ', ' ')).zza(zza(' ', '⁤')).zza(zza('⁪', '⁯')).zza(zzc('　')).zza(zza(55296, 63743)).zza(zza("﻿￹￺￻"));
  public static final zze zzakR = zza('\000', 'ӹ').zza(zzc('־')).zza(zza('א', 'ת')).zza(zzc('׳')).zza(zzc('״')).zza(zza('؀', 'ۿ')).zza(zza('ݐ', 'ݿ')).zza(zza('฀', '๿')).zza(zza('Ḁ', '₯')).zza(zza('℀', '℺')).zza(zza(64336, 65023)).zza(zza(65136, 65279)).zza(zza(65377, 65500));
  public static final zze zzakS = new zze.9();
  public static final zze zzakT = new zze.10();
  
  static
  {
    zze localzze = zza('0', '9');
    char[] arrayOfChar = "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray();
    int j = arrayOfChar.length;
    int i = 0;
    while (i < j)
    {
      char c = arrayOfChar[i];
      localzze = localzze.zza(zza(c, (char)(c + '\t')));
      i += 1;
    }
    zzakI = localzze;
  }
  
  public static zze zza(char paramChar1, char paramChar2)
  {
    if (paramChar2 >= paramChar1) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      return new zze.4(paramChar1, paramChar2);
    }
  }
  
  public static zze zza(CharSequence paramCharSequence)
  {
    switch (paramCharSequence.length())
    {
    default: 
      paramCharSequence = paramCharSequence.toString().toCharArray();
      Arrays.sort(paramCharSequence);
      return new zze.3(paramCharSequence);
    case 0: 
      return zzakT;
    case 1: 
      return zzc(paramCharSequence.charAt(0));
    }
    return new zze.2(paramCharSequence.charAt(0), paramCharSequence.charAt(1));
  }
  
  public static zze zzc(char paramChar)
  {
    return new zze.11(paramChar);
  }
  
  public zze zza(zze paramzze)
  {
    return new zze.zza(Arrays.asList(new zze[] { this, (zze)zzx.zzz(paramzze) }));
  }
  
  public boolean zzb(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length() - 1;
    while (i >= 0)
    {
      if (!zzd(paramCharSequence.charAt(i))) {
        return false;
      }
      i -= 1;
    }
    return true;
  }
  
  public abstract boolean zzd(char paramChar);
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */