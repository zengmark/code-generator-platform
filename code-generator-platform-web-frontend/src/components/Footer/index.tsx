import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '代码生成器';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'codeNav',
          title: '编程导航',
          href: 'https://github.com/zengmark',
          blankTarget: true,
        },
        {
          key: 'Ant Design',
          title: '编程宝典',
          href: 'https://github.com/zengmark',
          blankTarget: true,
        },
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined /> 代码仓库
            </>
          ),
          href: 'https://github.com/zengmark',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
