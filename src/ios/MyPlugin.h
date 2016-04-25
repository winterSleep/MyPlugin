//
//  MyPlugin.h
//  CordovaLib
//
//  Created by Li Zhiping on 4/25/16.
//
//

#import "CDV.h"

@class CDVInvokedUrlCommand;

@interface MyPlugin : CDVPlugin

- (void)test:(CDVInvokedUrlCommand*)command;

@end
